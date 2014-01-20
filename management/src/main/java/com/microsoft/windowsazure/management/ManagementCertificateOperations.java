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

package com.microsoft.windowsazure.management;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.models.ManagementCertificateCreateParameters;
import com.microsoft.windowsazure.management.models.ManagementCertificateGetResponse;
import com.microsoft.windowsazure.management.models.ManagementCertificateListResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* You can use management certificates, which are also known as subscription
* certificates, to authenticate clients attempting to connect to resources
* associated with your Windows Azure subscription.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/jj154124.aspx for more
* information)
*/
public interface ManagementCertificateOperations
{
    /**
    * The Add Management Certificate operation adds a certificate to the list
    * of management certificates. Management certificates, which are also
    * known as subscription certificates, authenticate clients attempting to
    * connect to resources associated with your Windows Azure subscription.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj154123.aspx
    * for more information)
    *
    * @param parameters Parameters supplied to the Create Management
    * Certificate operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse create(ManagementCertificateCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * The Add Management Certificate operation adds a certificate to the list
    * of management certificates. Management certificates, which are also
    * known as subscription certificates, authenticate clients attempting to
    * connect to resources associated with your Windows Azure subscription.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj154123.aspx
    * for more information)
    *
    * @param parameters Parameters supplied to the Create Management
    * Certificate operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> createAsync(ManagementCertificateCreateParameters parameters);
    
    /**
    * The Delete Management Certificate operation deletes a certificate from
    * the list of management certificates. Management certificates, which are
    * also known as subscription certificates, authenticate clients attempting
    * to connect to resources associated with your Windows Azure subscription.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj154127.aspx
    * for more information)
    *
    * @param thumbprint the thumbprint value of the certificate to delete.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String thumbprint) throws IOException, ServiceException;
    
    /**
    * The Delete Management Certificate operation deletes a certificate from
    * the list of management certificates. Management certificates, which are
    * also known as subscription certificates, authenticate clients attempting
    * to connect to resources associated with your Windows Azure subscription.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/jj154127.aspx
    * for more information)
    *
    * @param thumbprint the thumbprint value of the certificate to delete.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String thumbprint);
    
    /**
    * The Get Management Certificate operation retrieves information about the
    * management certificate with the specified thumbprint. Management
    * certificates, which are also known as subscription certificates,
    * authenticate clients attempting to connect to resources associated with
    * your Windows Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154131.aspx for
    * more information)
    *
    * @param thumbprint The thumbprint value of the certificate to retrieve
    * information about.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @return The Get Management Certificate operation response.
    */
    ManagementCertificateGetResponse get(String thumbprint) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException, ParseException;
    
    /**
    * The Get Management Certificate operation retrieves information about the
    * management certificate with the specified thumbprint. Management
    * certificates, which are also known as subscription certificates,
    * authenticate clients attempting to connect to resources associated with
    * your Windows Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154131.aspx for
    * more information)
    *
    * @param thumbprint The thumbprint value of the certificate to retrieve
    * information about.
    * @return The Get Management Certificate operation response.
    */
    Future<ManagementCertificateGetResponse> getAsync(String thumbprint);
    
    /**
    * The List Management Certificates operation lists and returns basic
    * information about all of the management certificates associated with the
    * specified subscription. Management certificates, which are also known as
    * subscription certificates, authenticate clients attempting to connect to
    * resources associated with your Windows Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154105.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @return The List Management Certificates operation response.
    */
    ManagementCertificateListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException;
    
    /**
    * The List Management Certificates operation lists and returns basic
    * information about all of the management certificates associated with the
    * specified subscription. Management certificates, which are also known as
    * subscription certificates, authenticate clients attempting to connect to
    * resources associated with your Windows Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154105.aspx for
    * more information)
    *
    * @return The List Management Certificates operation response.
    */
    Future<ManagementCertificateListResponse> listAsync();
}