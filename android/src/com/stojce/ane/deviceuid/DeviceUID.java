package com.stojce.ane.deviceuid;


import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;


/**
 * Android version of DeviceUID native extension.
 * Retrieves info of IMEI, IMSI and Android Build number
 * 
 * @author Stojan Ilic stolex [at] stojce.com
 *
 */
public class DeviceUID implements FREExtension{
	/*
	 * Creates a new instance of ANESampleContext when the context is created 
	 * from the actionscript code.
	 */
	public FREContext createContext(String extId) {	
		return new DeviceANEContext();
	}
	
	/*
	 * Called if the extension is unloaded from the process. Extensions
	 * are not guaranteed to be unloaded; the runtime process may exit without
	 * doing so.
	 */
	@Override
	public void dispose() {
	}

	/*
 	 * Extension initialization.
 	 */  
	public void initialize( ) {
	}
}
