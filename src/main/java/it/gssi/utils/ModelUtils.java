package it.gssi.utils;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import UniversityOrganization.UniversityOrganizationModel;
import UniversityOrganization.UniversityOrganizationPackage;



public class ModelUtils {
	
	private String modelPath = "classpath:model/UniversityOrganization.xmi";
//	@Value("${emf.model.path}") 
//	private String modelPath;
	
	@Autowired
	ResourceLoader resourceLoader = new DefaultResourceLoader();
	
	final static private ResourceSet resourceSet = new ResourceSetImpl();
	
	
	
	/**
	 * Register metamodel
	 */
	public void registerMetamodel() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(UniversityOrganizationPackage.eINSTANCE.getNsURI(), UniversityOrganizationPackage.eINSTANCE);
		System.out.println("Metamodel registered!");
	}
	
	public UniversityOrganizationModel loadModel() {

		registerMetamodel();

		Resource resource = resourceLoader.getResource(modelPath);

		org.eclipse.emf.ecore.resource.Resource resource2 = null;

		try {
			File file = resource.getFile();
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createFileURI(file.getPath());
			resource2 = resourceSet.getResource(uri, true);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (UniversityOrganizationModel) resource2.getContents().get(0);
	}

}
