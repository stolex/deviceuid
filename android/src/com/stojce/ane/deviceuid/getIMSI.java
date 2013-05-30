package com.stojce.ane.deviceuid;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class getIMSI implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		
		if (DeviceParams.imsi == null){
			if (DeviceParams.telManager != null){
				DeviceParams.imsi = DeviceParams.telManager.getSubscriberId();
				try{
					return FREObject.newObject( DeviceParams.imsi );
				}catch (Exception ignore) {}
			}
		}else try{
			return FREObject.newObject( DeviceParams.imsi );
		}catch (Exception ignore) {}
		
		return null;
	}

}
