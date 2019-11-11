# Eggventory User Guide
By: Team F09-03  
Dated: 11 November 2019  

## Table of contents  

### [1. Introduction ](#1-introduction)  
### [2. Quick Start ](#2-quick-start)  
### [3. Features and Command Usage ](#3-features-and-command-usage)  
##### [3.1 Viewing help ](#31-viewing-help-help)  
##### [3.2 Working with Stock Types ](#32-working-with-stock-types)  
##### [3.3 Working with Stocks ](#33-working-with-stocks)  
##### [3.4 Managing your list of People ](#34-managing-your-list-of-people)  
##### [3.5 Managing your list of Loans ](#35-managing-your-list-of-loans)  
##### [3.6 Loaning using Templates](#36-loaning-using-templates-1)
##### [3.7 Minimum Required Quantity](#37-minimum-required-quantity-1)
##### [3.8 Marking Stock as Lost ](#38-marking-stock-as-lost-coming-in-v20)  
##### [3.9 Searching the Inventory ](#39-searching-the-inventory-find-description)  
##### [3.10 Using Undo and Redo Commands ](#310-using-undo-and-redo-commands-coming-in-v20)  
##### [3.11 Setting autosave options ](#311-setting-autosave-options-coming-in-v20)  
##### [3.12 Exiting the program: bye ](#312-exiting-the-program-bye)  
### [4. Command Summary ](#4-command-summary)  
### [5. Glossary ](#5-glossary)  
  
  
## 1. Introduction  
Eggventory is an inventory management system targeted towards engineering laboratory inventories. It is designed to make tracking of stock and inventory fast and painless. There are visual elements for all functionalities which makes learning the system easy, but there are also command-line equivalents that allow advanced users to do everything in one or two short commands.  
  
## 2. Quick start  
  
1. #### [Download and install Java 11 on your machine. ](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)  
2. #### [Download the latest eggventory.jar the github repository. ](https://github.com/AY1920S1-CS2113T-F09-3/main/releases)  
3. #### Copy the file to the folder you want to use as the home folder for your inventory management system.  
4. #### Double-click the file to start the app. The GUI should appear in a few seconds.  
 
    ![](images/gui_startup.png)````
  
5. #### Type the command in the command box and press Enter to execute it  
   - Typing `help` and pressing `ENTER` will open the help window.  
  
6. #### Some example commands you can try:  
    
    - `add stocktype Resistors` : Creates a category of stock named “Resistors”. 
         
    - `add stock Resistors R500 200 500-ohm resistor` : Creates a new stock item with 200 500-ohm resistors and a stock code of “R500”, under the “Resistors” Stock Type.  
          
    - `edit stock Resistors R500 50` : Reduces the stock count of item R500 (500-ohm resistor) to 50.  
          
    - `add stocktype Capacitors`: Creates a category of stock named "Capacitors".
    
    - `add stock Capacitors C1k 75 1000pF` :  Creates a new stock item with 75 1000pF Capacitors and stock code “C1k”. The stock type will be defaulted to “Uncategorised”.   
         
    - `list stocktype Resistors` : Displays all stock that is categorised as Resistors.  
          
    -  `bye` : exits the app    
  
7. #### Refer to Section 3 for a more detailed list of commands you can use.  
    
## 3. Features and command usage  
  
The following section describes the command line interface commands that Eggventory recognises. Each command you input has to follow a specific format of words and parameters.  

**Predictive Search / Autocomplete**

To make entering of commands easier, Eggventory boasts the Predictive Search feature, which allows you to instantly autocomplete any commands you have input by simply hitting the `TAB` key on your keyboard.

For example, typing `add s` will give suggest `add stock` as the predicted input, as shown in the image below.

![](images/predictive_search_command.png)

After hitting `TAB`, the command is autocompleted for you, and you will be shown the valid arguments required by the command to help you remember the correct format of inputs for each command.

Holding the `SHIFT` key while hitting the `UP` or `DOWN` key will cycle through the other autocomplete possibilities suggested by the Predictive Search.

![](images/predictive_search_argument.png)

**Command History**

Did you enter a command incorrectly and came across a Parser error? Not to worry, because in addition to the Predictive Search, You can also use the `UP` and `DOWN` arrow keys to cycle through previously entered inputs so that you can edit them before re-entering them correctly.

**Command Format**    

- Text in \<AngledBrackets\> are mandatory parameter to be supplied by the user. E.g. `add stocktype <StockType>` , \<StockType\> is a parameter which is the name of the stocktype the user wishes to add.  
  
- Parameters in {Braces} can be repeated multiple times in the same command, separated by a space. E.g. `add template <TemplateName>  {<StockCode> <Quantity>}` , more \<StockCode\> \<Quantity\> pairs can be added after the first pair as such: `loan add A0191234A R500 20 R250 10 R100 5`  
  
-   **[coming in v2.0]** Some commands have optional parameters available. Optional parameters are added to the end of the corresponding command, after all mandatory parameters. E.g. `add stock R500 50 “500-ohm Resistors” -st Resistors` , will create a new stock, and placed under the “Resistors” Stock Type with the “-st” tag.  
  
### 3.1 Viewing help: ``help``  
  
General help: Displays a basic list of commands and their input formats.  
  
Format: `help`  
  
Specific help: Displays a more detailed list of commands of that type, with information about each input required.  
  
Format: `help <Command>`  
  
eg. `help edit`
  
---  
### 3.2 Working with Stock Types  
Stock Types are the main categories of the inventory, and each Stock Type stores multiple Stocks. For example, your inventory may have Stock Types such as Resistors, Tools or Wires. You are required to add your Stock Types to the inventory before Stocks can be added. By default, Eggventory comes with an Uncategorised Stock Type, where Stocks not assigned to a specified Stock Type are added.  
  
Note: Stock Type names are not allowed to have spaces in them.  
  
#### 3.2.1 Adding new Stock Types: `add stocktype`  
  
This adds a new category of stock to the inventory.  
  
Format: `add stocktype <StockType> ` 

eg. `add stocktype Resistor`  
  
#### 3.2.2 Deleting Stock Types: `delete stocktype`  
    
This removes a Stock Type from the inventory, and all Stock under it.  
  
Format: `delete stocktype <StockType>`  

#### 3.2.3 Editing Stock Types: `edit stocktype`  
    
This changes the name of the selected Stock Type.
  
Format: `edit stocktype <StockType> <NewName>`

#### 3.2.4 Listing All Stock Types: `list stocktype all`  
  
This lists out all Stock Types that are present in the inventory.  
  
Format: `list stocktype all`  

---  
### 3.3 Working with Stocks  
Stocks are the main types of items that Eggventory helps you to manage. Every Stock belongs to a Stock Type. For example, you may have the Stocks “500 ohm resistor” and “1k ohm resistor” in the Resistor Stock Type.  
  
Stocks may be Collective or Unique. Collective stocks consist of items that are not tracked individually. They generally are Stocks that do not have each have their own serial number (Stock Code), and are considered interchangeable. Unique Stocks are items that are often expensive or limited in quantity. Such Stocks usually are each assigned a serial number (Stock Code), and are loaned out and tracked by this number. Stocks are set as Collective by default.  
  
Stocks have the following properties:  

| Property | Description |  
|---:|---| 
StockType|The category the stock belongs to. The StockType should have previously been added to the inventory system before being referenced.  
StockCode|A unique string of numbers and letters, used to identify the stock.  
Quantity | The number of items under the stock.
Description | The common name of the item.  
  
Note: Stock Codes are not allowed to have spaces in them, and no two Stocks can share the same Stock Code.  
  
#### 3.3.1 Adding new Stocks: `add stock`  
  
This adds a new stock to the inventory.  
  
Format: `add stock <StockType> <StockCode> <Quantity> <Description>`  
  
eg. `add stock Resistor R500 1000 500ohm resistor`  
  
In addition to the required parameters, stocks can also be added with the following optional parameters:  

Format|Purpose|  
|---|---|  
`-m <MinQuantity>` |Sets the [minimum required quantity](#37-minimum-required-quantity-1) of stock that should be maintained in the inventory  
`-u`|**[coming in v2.0]**  Sets the stock to contain items that are unique  
  
Format: `add stock <StockType> <StockCode> <Quantity> <Description> {<optional parameter>}`  
  
eg. `add stock Resistor R500 1000 500ohm resistor -m 100`  
  
#### 3.3.2 Deleting Stocks: `delete stock`  
    
This removes a stock from the inventory, including any references to loaned out stock.  
  Format: `delete stock <StockCode>`
  
#### 3.3.3 Editing Stock: `edit stock`  
    
This directly modifies the value of a property stock.
  
Keywords to modify each property:  
- `description`  
- `quantity`  
- `minimum`  

Note: The ability to edit StockCode and StockType will be added in v2.0. For now, please delete and re-add a stock if you need to change those properties. 
    
Format: `edit stock <StockCode> <Property> <NewValue>`  
  
eg. `edit stock R500 quantity 1000`: Changes the quantity of the stock R500 to 1000.
  
#### 3.3.4 Listing Stock: `list stock`  
    
This lists out all Stocks that are present in the inventory.  

Format: `list stock`
  
#### 3.3.5 Listing Stock of a particular StockType: `list stocktype <StockType>`  
    
This lists out all Stock under a particular Stock Type  
  
Format: `list stocktype <StockType>`  
  
eg. `list stocktype Resistor`  
  
---  
### 3.4 Managing your list of People  
People have to be added to the system before they can take loans from the inventory. Each person is identified by their matric number, as the inventory primarily loans out Stock to students.  
  
#### 3.4.1 Adding a Person: `add person`
  
This adds a new person to keep track that will loan Stock.  

Format: `add person <MatricNo> <Name>`  
  
eg. `add person A0123456 John Doe`  

Note: By nature, the matric number of each person should be unique, meaning no two individuals are allowed to share the same matric number.  
  
  
Optional Parameters: **[coming in v2.0]**  

|Format|Purpose|  
|---|---|  
|`-c <Course>`|Sets the course of the person being added|
|`-m <Module>`|Sets the module that the person is taking. Multiple modules may be added.

Format: `add person <MatricNo> {<flag> <optional parameter>}`  
  
eg. `add person A0187654 Raghav -c CEG -m CG2271 -m CS2113T`  
  
#### 3.4.2 Deleting a Person:` delete person`  
  This removes a person from being tracked. All their outstanding loans remain in the system and have to be deleted separately.  
  
Format: `delete person <MatricNo>`  
  
eg. `delete person A0123456`  
  
#### 3.4.3  Editing a Person’s details: `edit person` **[coming in v2.0]** 
    
This directly modifies the value of a property of a person.  
  
Properties:  
- MatricNo
- Name
  
Format: `edit person <MatricNo> <Property> <NewValue>`

e.g. `edit person A0123456 name Alex`
  
#### 3.4.4 Listing all People: `list person`  
    
This lists all the people in the system, along with any information recorded about them.  
  
Format: `list person`  
  
---  
### 3.5 Managing your list of Loans  
    
#### 3.5.1 Adding a Loan: `add loan`
    
This adds a new loan of a particular Stock to a particular person.
  
Format: `add loan <MatricNo> <StockCode> <Quantity>`  
  
eg. `add loan A0123456 R500 1000`  

#### 3.5.2 Deleting a Loan: `delete loan`
This deletes an existing loan assigned to a person. If there are multiple loans of the same Stock to that
 person, the first instance of such a loan will be deleted.

Format: `delete loan <MatricNo> <StockCode>`

e.g. `delete loan A0123456 R500`
  
#### 3.5.3 Returning specific Loans: `loan return` **[coming in v2.0]**  
    
This marks specific Loans of a Person as returned. The loan remains archived in the system, but the stock is free to be loaned out by someone else. 
  Format: `loan return <MatricNo> {<StockCode> <Quantity>}`  
  
#### 3.5.4 Returning all Loans: `loan returnall` **[coming in v2.0]** 
    
This marks all Loans of a Person as returned.  

Format: `loan returnall <MatricNo>`  
  
#### 3.5.5 Listing all Loans: `list loan`
    
This lists out all loans currently recorded.   
  
Format: `list loan`  

#### 3.5.6 Listing all Loans to one Person: `list loan <MatricNo>`
    
This lists out all loans currently recorded.   
  
Format: `list loan <MatricNo>`
  
---  
### 3.6 Loaning using Templates
    
To speed up the loaning process, Eggventory allows you to create loan templates. These templates are simply lists of stocks and quantity to be loaned out all at once. Loans added via templates are not special in any way. As such, you will have to delete each loan added by a template individually.
  
#### 3.6.1 Adding loan templates: `add template`  
This creates a new template of loans which can be assigned to a person.

Format: `add template <TemplateName> {<StockCode> <Quantity>}`  
  
e.g. `add template CG1112_Alex R500 5 A123 1`  
 
Note: The name of each template must be unique, or it will not be added. 

#### 3.6.2 Making a Loan from a template: `add loan`

This adds a loan to a person from a template. Every loan in the template will be added to the person as if you added them individually. 

Format: `add loan <MatricNo> <TemplateName>`  
  
eg. `add loan A0187654 CG1112_Alex`

If you have added the template "CG1112_Alex" using this example above, you can use the list loan command to view the
 newly added loans using the template like this.  
 ![](images/templateListAlex.png)

#### 3.6.3  Deleting a Template: `delete template`  

This deletes a loan template. It does not delete any loans assigned to people using the template.

Format: `delete template <TemplateName>`  
  
eg. `delete template CG1112_Alex`  
  
#### 3.6.4 Listing Loan Templates: `list template` 
  
Once you have added at least one template, you will be able to see them all listed out with this command. 
  
Format: `list template`

This is an example of what the output will look like with 3 templates added.
 ![](images/templateList.png)
  
---
### 3.7 Minimum Required Quantity

The _minimum required quantity_ is the minimum amount of the stock that your lab intends to have on hand at all times. Loans can still be made until the stock fully runs out, but additional
  warnings will be displayed to remind you that stock is running low. 
  
In context, your lab may typically start restocking batteries when there are less than 30 batteries left. Thus, your minimum
   required quantity should be set to 30. 

#### 3.7.1 Setting Minimum Required Quantity
There are two ways to set a stock's minimum required quantity. 

The first is to specify it when adding the stock, using the optional parameter `-m <MinimumQuantity>`. An additional confirmation message will acknowledge your use of the optional parameter. 

Format: `add stock <StockType> <Stock Code> <Quantity> <Description> -m <MinimumQuantity>`  
  
eg. `add stock Resistor R1k 1000 1Kohm resistor -m 500`

   ![](images/add_mrq.png)

If you did not assign a minimum required quantity to the stock when it was added, you can edit it at any time using the `edit` command. 
  
Format: `edit stock <StockCode> <Property> <NewValue>`  
  
eg. `edit stock R500 minimum 100`  
  
#### 3.7.2 Receiving warnings about Quantity

Once you have set a _minimum required quantity_, checks are performed to compare the _available quantity_ (total quantity without loaned or lost stock) and _minimum required quantity_ at every instance where any values are updated. If your latest action, such as adding a loan, causes the available quantity to fall below minimum, a warning will be printed as shown below. 

   ![](images/add_loan_mrq.png)

Realistically, you may not have sufficient quantity of a stock at the moment you add it into the system. Thus, it is normal to receive minimum quantity warnings when adding a stock that currently has less than the minimum quantity, as shown below.

   ![](images/add_below_mrq.png)
  
#### 3.7.3 Listing Stocks that are low in quantity: `list minimum`

This shows you a complete list of stocks below their minimum required quantities. This list allows you quickly determine which stocks are running out, and understand how much of this is due to excessive loaning or loss [coming in v2.0] of items. 

Format: `list minimum`

   ![](images/list_min.png)

#### 3.7.4 Generating Shopping List: `list shopping`

This automatically generates a list of Stock and the quantity of each that you should consider buying in order to attain the minimum required quantities. 

Format: `list shopping`

   ![](images/shopping_list.png)

---  
### 3.8 Marking Stock as lost **[coming in v2.0]**
Marks a certain quantity of a stock as lost. Differs from deleting stock in the fact that the quantity of stock will still be saved in the inventory (eg. for administrative purposes). Lost stock will not be included in tallies of available stock.  
  
#### 3.8.1 Marking Stock as lost: `lost`  
    
Format: `lost <StockCode> <Quantity>`  
  
eg. `lost R500 10`  
  
#### 3.8.2 Marking Loaned Stock as lost:   
This directly marks a quantity of a Person’s Loan as lost. The items are removed from the Loan list and counted as lost within the main inventory.  
  
Format: `lost <MatricNo> <StockCode>`
  
### 3.9 Searching the inventory: `find description`
It is possible to search the inventory for a Stock based its description with the find command. All Stocks with description containing the query will be displayed.  

Format: `find description <Query>`  

---  
### 3.10 Using Undo and Redo commands:
  
Eggventory supports undo-ing and redo-ing of commands you have entered by accident to reverse or redo their effects. You can `undo` and `redo` the following commands:

- `add`
- `delete`
- `edit`
  
#### 3.10.1 Undoing a command: `undo`
  
Did you accidentally delete the wrong Stock? Not to worry! You can use the `undo` command to undo your error and correct any disastrous mistakes!

As stated above, `undo` works for the `add`, `delete`, and `edit` commands.

 Format: `undo`  
  
#### 3.10.2 Reversing an undo command: `redo`  
    
Did you want to delete that Stock after all? You can reverse your `undo` command using the `redo` command!

As stated above, `redo` works for the `add`, `delete`, and `edit` commands.

Format: `redo`  

Below is an example of the `undo` and `redo` commands in use.

  e.g.
   ![](images/add_below_undoredo.png)
---  
### 3.11 Setting autosave options: **[coming in v2.0]**
  Eggventory automatically saves the current inventory to the disk every time data is added, removed, or edited. This saves you from the paranoia of having to save after every change you make, since Eggventory handles saving for you!
  
  However, you can disable this feature with this command. Eggventory will then save only when the program exits.  
  
Format: `autosave on` OR `autosave off`  
  
---  
### 3.12 Exiting the program: `bye`  

Finished with your work and would like to safely quit Eggventory? Type in the `bye` command and Eggventory will save your inventory and close.

Goodbye and thank you for using Eggventory! We hope to see you again!

Format: `bye`  

## 4. Command Summary  
### Add Commands  

|Command| Syntax  
|---|---|  
  add stock | `add stock <StockType> <StockCode> <Quantity> <Description>` 
  add stocktype | `add stocktype <StockType>`  
  add person | `add person <MatricNo>`  
  add template | `add template <TemplateName> {<StockCode> <Quantity>}`
  
  ### Delete Commands  
|Command| Syntax  
|---|---|  
delete stock | `delete stock <StockCode>`  
delete stocktype | `delete stocktype <StockType>`  
delete person | `delete person <MatricNo>`  
delete template | `delete template <TemplateName>`

  ### Edit Commands  
|Command| Syntax
|---|---|  
edit stock | `edit stock <StockCode> <Property> <NewValue>`
edit stocktype | `edit stocktype <StockType> <NewStockType>`
edit person | `edit person <MatricNo> <Property> <NewValue>`  
  
### List Commands  
| Command | Syntax  
|---|---|
list stocks | `list stock`
list stocktype | `list stocktype all`  
list stocktype | `list stocktype <StockType>`
list person | `list person`  
list loan | `list loan`  
list template | `list template`  
list lost | `list lost`
  
### List Minimum Commands  
| Command | Syntax  
|---|---|
list minimum | `list minimum`
list shopping | `list shopping`

  
### Loan Commands 
|Command| Syntax  
|---|---|  
add loan | `add loan <MatricNo> <StockCode> <Quantity>`
loan return | `loan return <MatricNo> <StockCode> <Quantity>`
loan returnall | `loan returnall <MatricNo>`

### Template Commands
|Command|Syntax
|---|---|
  add template | `add template <TemplateName> {<StockCode> <Quantity>}`
  delete template | `delete template <TemplateName>`
  add loan | `add loan <TemplateName>`
  
### Find Commands
|Command|Syntax
|---|---|
find description | `find description <Query>`

 
### Lost Commands **[coming in v2.0]**
|Command| Syntax  
|---|---|  
lost | `lost <StockCode> <Quantity>`
  
  
  ### Other Commands  
|Command| Syntax  
|---|---|
undo last command | `undo`  
redo previous command | `redo`  
exit application | `bye`
 
## 5. Glossary  
|Item|Description|
| --- | --- |
Matric No. | Matriculation number of student to be added  
Stock | A physical asset to be tracked by Eggventory  
Stock Code | A unique string of characters to identify a stock  
Stock Type | A category of stock
Query | The word or phrase to search for