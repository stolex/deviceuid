package com.stojce.ane.deviceuid;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class DeviceANEContext extends FREContext {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		
		DeviceParams.telManager = (TelephonyManager) getActivity().getSystemService( Context.TELEPHONY_SERVICE );
		
		Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>();
		functionMap.put("getIMEI", new getIMEI() );
		functionMap.put("getIMSI", new getIMSI() );
		functionMap.put("getBuildID", new getBuildID() );

		return functionMap;
	}

}
