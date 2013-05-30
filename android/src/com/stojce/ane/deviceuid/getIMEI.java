package com.stojce.ane.deviceuid;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class getIMEI implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		// TODO Auto-generated method stub
		
		if (DeviceParams.imei == null){
			if (DeviceParams.telManager != null){
				DeviceParams.imei = DeviceParams.telManager.getDeviceId();
				try{
					return FREObject.newObject( DeviceParams.imei );
				}catch (Exception ignore){}
			}
		}else try{
			return FREObject.newObject( DeviceParams.imei );
		}catch (Exception ignore) {}
		
		return null;
	}

}
