# security-dashboard

## 1. Goal
The IT Administrators manage the data center hardware using the data center management software. These administrators perform various operations on a daily basis that includes server management, network and storage management, backup and recovery. Additionally they have the critical responsibility of taking care of the security aspects of the software on a regular or need basis.  Typically these operations would take time and reducing the productivity.  Automation of such operations by providing suitable algorithms and configurability options through a web service would improve the productivity. Additionally the proposal would give an effective usability for the IT Administrators during this software release

## 2. Capabilities
 - List the ciphers that are supported
 - Configure the SSL for protocols and ciphers
 - Perform sample tests on appliance and provide the protocols used for testing
 - List the vulnerabilities that are handled in appliance CVEs for a given component
 - Provides public cert details
 - List the protocols that are supported


## 3. What makes it different?
There are various security scanners that are capable of scanning the ssl protocols and verify various ssl capabilities and provide the details. There are various commercial and open source products, but most of them are suitable for public domain servers or on line solutions. Also, they are limited to the ssl scanning and related aspects. There are also some advanced products and research attempts in this area that provide security details of the servers and browsers. Some of these capabilities are required for data center management software also. Additionally there are more security aspects around certificates, etc., that need to be reported for a smooth management of data centers using the manageability software.

## 4. Architecture

The system is designed as the architectural diagram as described above. The client would be the end which would be in conversation with the host. The client will send the connection request to the host and the host will authenticate the client. The client then asks the user to accept the URI of the page to load. The client request to load the URI and the page is opened. Few other parameters are passed along with the URI which are hit on the REST API and then the details are being passed to the invoking method for further processing. These mapping is done using Web.XML file which has got context switching details made available. 
The Controller class is responsible for invoking the method of all classes. Different methods have different capabilities in their scope. These are Getting ciphers list, updating ciphers, Getting protocols list that can be supported and updating the protocols required, Vulnerabilities can be checked by applying all the above needed ciphers and protocols. All of these methods would result in several dedicated outputs that can show us various properties like: Cipher Report, Port Scan, Protocol Configuration, Cipher Configuration Vulnerabilities Report and so on. The results could be displayed on the screen or on the file as needed.