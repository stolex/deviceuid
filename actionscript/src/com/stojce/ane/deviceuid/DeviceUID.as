package com.stojce.ane.deviceuid {
	import flash.external.ExtensionContext;
	
	/**
	 * Adobe Air Native Extension used to retrieve some variants of Android device unique identificators
	 *  
	 * @author Stojan Ilic stolex [at] stojce.com
	 */
	
	public class DeviceUID {
		
		private static var _extContext:ExtensionContext = null;
		
		public function DeviceUID()	{
			if (!_extContext) {
				_extContext = ExtensionContext.createExtensionContext("com.stojce.ane.deviceuid","DeviceUID");
			}
		}
		
		/**
		 * return IMEI code of device. On Android IMEI exist only on some phones
		 */
		public function getIMEI():*{
			return parseToString( _extContext.call("getIMEI") );
		}
		
		/**
		 * return IMSI code of device
		 */
		public function getIMSI():*{
			return parseToString( _extContext.call("getIMSI") );
		}
		
		/**
		 * return Android BuildID of device. This value exist in Android version above 2.3 and when user restore factory default settings of the device, this ID is changed 
		 */
		public function getBuildID():*{
			return parseToString( _extContext.call("getBuildID") );
		}
		
		/**
		 * parse retrieved object to String
		 */
		private function parseToString(result:*):String{
			if (result) return result.toString();
			return null;
		}
	}
}