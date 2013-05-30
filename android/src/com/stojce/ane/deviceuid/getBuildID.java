package com.stojce.ane.deviceuid;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class getBuildID implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		if (android.os.Build.ID != null){
			try{
				return FREObject.newObject( DeviceParams.imei );
			}catch (Exception ignore){}
		}
		return null;
	}

}
