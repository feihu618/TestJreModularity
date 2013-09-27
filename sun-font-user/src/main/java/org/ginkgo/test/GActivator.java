package org.ginkgo.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import sun.font.FontManager;


public class GActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println(GActivator.class.getName()+" is loaded by ClassLoader: "+getClass().getClassLoader().getClass().getName());
		FontManager fm = null;
		try{
			fm = new FontManager();
			ClassLoader clazzLoader = fm.getClass().getClassLoader();
			System.out.println("FontManager's classloader:"+(clazzLoader != null ? clazzLoader.getClass().getName() : "bootstrap class loader"));
		}catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	





	@Override
	public void stop(BundleContext context) throws Exception {
		
	}
	

}
