/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.notificationhubs.models;

/**
* Description of a NotificationHub ApnsCredential.
*/
public class ApnsCredentialProperties {
    private String apnsCertificate;
    
    /**
    * Optional. Gets or sets the APNS certificate.
    * @return The ApnsCertificate value.
    */
    public String getApnsCertificate() {
        return this.apnsCertificate;
    }
    
    /**
    * Optional. Gets or sets the APNS certificate.
    * @param apnsCertificateValue The ApnsCertificate value.
    */
    public void setApnsCertificate(final String apnsCertificateValue) {
        this.apnsCertificate = apnsCertificateValue;
    }
    
    private String certificateKey;
    
    /**
    * Optional. Gets or sets the certificate key.
    * @return The CertificateKey value.
    */
    public String getCertificateKey() {
        return this.certificateKey;
    }
    
    /**
    * Optional. Gets or sets the certificate key.
    * @param certificateKeyValue The CertificateKey value.
    */
    public void setCertificateKey(final String certificateKeyValue) {
        this.certificateKey = certificateKeyValue;
    }
    
    private String endpoint;
    
    /**
    * Optional. Gets or sets the endpoint of this credential.
    * @return The Endpoint value.
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    
    /**
    * Optional. Gets or sets the endpoint of this credential.
    * @param endpointValue The Endpoint value.
    */
    public void setEndpoint(final String endpointValue) {
        this.endpoint = endpointValue;
    }
    
    private String thumbprint;
    
    /**
    * Optional. Gets or sets the Apns certificate Thumbprint
    * @return The Thumbprint value.
    */
    public String getThumbprint() {
        return this.thumbprint;
    }
    
    /**
    * Optional. Gets or sets the Apns certificate Thumbprint
    * @param thumbprintValue The Thumbprint value.
    */
    public void setThumbprint(final String thumbprintValue) {
        this.thumbprint = thumbprintValue;
    }
}