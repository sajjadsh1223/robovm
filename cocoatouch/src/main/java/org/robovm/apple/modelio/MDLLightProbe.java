/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.modelio;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLLightProbe/*</name>*/ 
    extends /*<extends>*/MDLLight/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLLightProbePtr extends Ptr<MDLLightProbe, MDLLightProbePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLLightProbe.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLLightProbe() {}
    protected MDLLightProbe(SkipInit skipInit) { super(skipInit); }
    public MDLLightProbe(MDLTexture reflectiveTexture, MDLTexture irradianceTexture) { super((SkipInit) null); initObject(init(reflectiveTexture, irradianceTexture)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "reflectiveTexture")
    public native MDLTexture getReflectiveTexture();
    @Property(selector = "irradianceTexture")
    public native MDLTexture getIrradianceTexture();
    @Property(selector = "sphericalHarmonicsLevel")
    public native @MachineSizedUInt long getSphericalHarmonicsLevel();
    @Property(selector = "sphericalHarmonicsCoefficients")
    public native NSData getSphericalHarmonicsCoefficients();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithReflectiveTexture:irradianceTexture:")
    protected native @Pointer long init(MDLTexture reflectiveTexture, MDLTexture irradianceTexture);
    @Method(selector = "generateSphericalHarmonicsFromIrradiance:")
    public native void generateSphericalHarmonics(@MachineSizedUInt long sphericalHarmonicsLevel);
    /*</methods>*/
}
