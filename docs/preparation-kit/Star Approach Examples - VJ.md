# Project 
XYZ Data Management has undertaken a transformation program, to create an central place to collect and provide data across the entire organization in all geographic locations

* (S)
  * This project manages the all type of data for all lob's IT technology and operations. 
  * I do not have conceptual level understanding when I started
  * I don't have data models of any domain, so unable to understand what are the critical data elements and how to map them to industry data model
  * Do not have any understanding of Data mapping across different vendor tools (fireeye, reveringlab, fortify, quayles, virus total ) and don't have a common answer
    * Scanning tools
    * vulnerabilities databases (mitre, nvd, whitesource)
  * I do not have data in one place to make them meaningful, most of the system are in system to system integration/connections. 
    * I do not have proper channels to pull and push data and make them meaningful
* (T) Task was to streamline the process to make all its system across organization to connect seamlessly. 
  * So, risk across the organization can be identified quickly and remediation can be possible prior to time.
* (A) I started with conceptual model, how the domain and entity looks in to ecosystem
  * I go little down I have logical data model with entities and attribute and the relationship between them
    * I go down little-bit can have the structure data, and can know which data is important based on geolocation and regulatory requirement and geo restrictions
    * Now comes to engineering, how to make that data available, so we created data lake to have any sort of data init.
* (R) So, after integrating to boots BCM, system was organized and overhead of updating it everywhere get minimized.
* Workflow:
  * Prerequisite: IMI system provides product, price and stock information to WCS
  * User requests goes to WCS (Websphere Commerce System)
  * WCS send check inventory request and place order
    * Request goes to Farms broker
    * Request goes to consignment
    * Request goes to Posten for delivery charge calculation
* What was the architecture
This was layered architecture 
* On the Top we have Frontend WCS (Websphere Commerce System) 
* Middle we have Integration system 
* And on bottom layer of the architecture we have country specific system.
* What approach you followed
We have 4 story here for this project and we did timeboxing of each
1.	We have approached the frontend system to know what are the input and output they need from end system
2	Then we approached end system to know the requested input output and the format of data and data complexity and relationship with in.
3	Is there any flow already fetching same data set from end system? No
So, we have designed this integration flow from scratch
4	Unit Testing and fixing the mismatch and gaps                 

* Why did only this approach<br>
This this approach we can easily able to identify the work and completion based on time box

* How big was your team
  * Agile Team - 9
  * 2 Frontend Developer to implement the change in frontend – 1 at offshore
  * 3 Integration (Myself) - 2 at offshore
  * 2 End System 
  * 2 Tester – 1 at offshore

* What role you were playing
Integration Lead/Developer

* Example:

# Project 
XYZ-Recruitment project is to improve the candidate journey of the potential employees who search for and subsequently apply for jobs on the XYZ’s Online Recruitment Portal, which was consists of Oracle DB and XYZ’s Jobs website. 
* (S) XYZ's Online Recruitment Application was consist of Oracle Database and XYZ's Job website. System is lacking with various capabilities like integration, scalingup, UI user friendlyness. Also User interface and Database are very tight cupled. For example user can get data base errors on UI. 
* (T) I was given to remove tight coupling beetween the system and simplify the design and development. Also to improve the candidate journey of the user, who search and apply for job on portal.
* (A) XYZ introduced integration/microservices beetween Portal and database.
* (R) Using this solution(integration/microservices) their job portal was improved and user were able to search and apply job easily
* Example:
  * Jobs Microservice : To read/get, create, update and delete jobs. Use by user and admin.
  * Application Microservice : use by user to create application, use by admin to get submitted application..
  * User Microservice : All CRUD operations.

# Project 
SFDC - GE Healthcare aiming for transformation in medical technologies and services that are shaping a new age of patient care. This project is to streamline business function and provide integration for smooth functioning of its applications(salesforce) and processes across the countries. 
* (S)
* (T)
* (A)
* (R)
* Example:

# Project
Lending Process Application (LPA) - LPA project is to simplify the lending process of XYZ.  It includes remove multi step complex process for lending application. Due to this lending process lifecycle is higher than other competitor banks.  Using integration, we have reduced point to point interaction for each step and used parallel steps wherever possible, though this solution we have simplified lending process lifecycle.                                                                         * (S) Bank has very lengthy leding process and most of steps are manual, due to this customer are moving to other competitor for lending.
* (T) We have to understand the pain point of the steps. Time to market, Automation of manual steps.
* (A) We have simplify existing application in small unit of components/microservices. Added parallel steps, for example credit check, profile check, property check, also included automation beetween the steps (Workflow)
* (R) After this enhacement, lending application requests are dramatically increase in the bank.                     
* Example: Created few Microservices
  * lend ammount calculator  : to calculate how much i can lend (CRUD)
  * lending application : start a application for lending  (CRUD)
  * lending products : what are lending product after by bank, home loan/ persoanl loan etc (CRUD)
  * lending customer profile : customer service to take care of customer data and his interest (CRUD)
* How big was your team
  * Agile Team - 9
  * 2 Frontend Developer to implement the change in frontend – 1 at offshore
  * 3 Microservice developer (Myself) - 2 at offshore
  * 2 End System 
  * 2 Tester – 1 at offshore
* What role you were playing
  Integration/Jav Developer

# Project
Treasury & Securities Services - DDA (Demand Deposit Account) provides the method to clients of JPMC to make payment, receive deposit and manage cash flow. This type of account is also commonly known as current account or a cash account.  A DDA is Core product for JPMC client and provide the gateways into many other treasury products. We have limited End of the day capability, and we have complicated model relies on separate systems. So, through integration we have provided Full-Intra-Day capabilities. Our clients can get complete, accurate and timely data, as well as other LOBs and functional group. 
* (S)
* (T)
* (A)
* (R)
* Example:
  * Error Framework
  * Logging Framwork

# Project 
EAI Libra Package 6 - Alcatel Lucent EAI Libra Package 6 team provides EAI solutions for the integration of Alcatel-Lucent’s diverse applications within the enterprise and the trading partners. Our team helps ALU in streamlining and smooth functioning of its applications and processes across the countries.
* (S)
* (T)
* (A)
* (R)
* Example:

# Project 
Integrated Services Platform (ISP) - This is the first major strategic initiative to use a comprehensive Services Oriented Architecture approach to integration in Dell. The ISP program is to deploy Siebel as the new global CRM tool at Dell
* (S) Dell has few legacy system, have limited functionality like scaling the system integration with 3rd party system etc. due to this legecy system was isolated and very difficult to implement any functionality. 
* (T) Dell introduced a new system Sibel CRM and want us to implement integration between them, so that legacy system and new system share the responsibility together.  
* (A) We have develope the SOAP service between them, which was on SOA architecture style, so both system can have integration using SOAP service.
* (R) We have connected isolated system through SOAP with SOAP Web Service integration, This help them to integrate system with other 3rd party systems.
* Example: Created Few Soap Services
  * Product - CURD SOAP Operation 
  * Service - CURD SOAP Operation 

# Project 
ACS - Comcast provides a customer-facing post-sale portal, which serves as a single location to get information about upgraded or value-added service offerings, as well as access to their Business-Class Webmail, including business-related news and journals and an FAQ section intended to reduce the effort on to the existing technical support and customer service. 
* (S)
* (T)
* (A)
* (R)
* Example:
