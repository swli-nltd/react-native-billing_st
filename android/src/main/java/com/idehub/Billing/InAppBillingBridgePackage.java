package com.idehub.Billing;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InAppBillingBridgePackage implements ReactPackage {

    public InAppBillingBridgePackage(String licenseKey) {
        _licenseKey = licenseKey;
        _licenseKeySetInConstructor = true;
    }

    public InAppBillingBridgePackage() {
    }

    private String _licenseKey;
    private Boolean _licenseKeySetInConstructor = false;
    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new InAppBillingBridge(reactContext,"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAycNn6gsfse+EqJ3lvmfy4YT0poXuJkdCeRdrhw3nxytGzIeqUktbPSECxZzvVfmU1nQjB5bhSPrvLS7qAglio+g3yuyDrC0lXiP0owAh1FZTlUy7+Bhw896gqC81WQB1R0P/uqGF2/NWPEdgZWkMGwjjR2bRCQooxNDXfKpbD/9dcaU5vA+zKhCMn/nA0v2nq13kDDdktIL2wdrlEyVAxJsdfLHep5vNzTSwdldcVS+hAkGktEocSMkNe5acTZCEsGz0EV+sIqf9ES9wVIJ9kHVs4nijOt+04/bixeCJP8oLTtd92JScd2LTctiHmOE6TBQzlpX7ZtqDm2I9+kL8kQIDAQAB"));

        // modules.add(new InAppBillingBridge(reactContext,"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuvz0Q0y0YzQ3y+QQaFXaZT2+wRhzYiXP6Ob4yHrhQKFis2jgIs2EIebIbQKGG1VtW8WMfcWRhRWR5SbdAM3kk0v3MQga/wUkDpEwXJfAQC670u3uTLBDvlo+QI0l4jwIHKmC/7nhY+f8ZA8iEUyrpFkhnWHVmCm9raQC5h3nldoeOQB4emUx6SB6IYDcseDkYUY/jh/2G8J3OcaMeHx6sfa8x7tpN1wi9ffW7hCceRJwPSUzW8ViWLLvm22CH6eVsc4g1j+8NkpnIrharluFojobfYCUXhhqaynP1fFaqe0C1aUp8g8huAG7Tviyfo2Yb6uKI1BJ68e1aXG3lhbaUwIDAQAB"));
//
//        if (!_licenseKeySetInConstructor)
//              	modules.add(new InAppBillingBridge(reactContext));
//      		else
//                modules.add(new InAppBillingBridge(reactContext,"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt8DeTn8Wiu8VwtmYvMsi1A8WtsTXOE2JcDP2NQBEyl/AMfkfUYzBprjMbcuxmccbc+MjxZvMcZxIfMw+k3fl73S8LKWLEkpbgAx8vN9z2V7BHVvf+wcEimq5ZhVTUd9uU0WEDGGu+fVyrfJNbjY6Ub+cEMfA0P08z31f3Ou7lxKobJa3YuTv9VAv8Jz7tWtqAVcFQXOrK8y/EWW1xypvpkF9cuMBsWPMEq3q4W8w5eAZ7QfzF1AKpRJh7eStZwulWWrFMeffAsgSqjkVLcxznGCU7t7RwesJ1Xv1SU/B7N2an2mGsHp3VmRhQ4ZlfVMCo7X/IbrGu05NVkcm3a4zsQIDAQAB"));

          return modules;
    }

    // Depreciated RN 0.47
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<ViewManager>asList();
    }
}
