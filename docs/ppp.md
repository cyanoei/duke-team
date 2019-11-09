# Project Portfolio - Eggventory
### By: Oei Chiu Yan Rebecca

---
## About the Project

**Eggventory** is an inventory management system created by four other Computer Engineering students and me for our Year 2 Software Engineering module. During the first half of the module, we each created a simple task manager application. For the second half of the module, we were given 6 weeks to enhance one of the team members’ individual applications, or modify it into a different product. 

Our team chose to create Eggventory, an inventory management system specifically designed to be used by lab technicians in NUS Engineering labs. In particular, Eggventory is made specifically for use in schools, and allows users to track loans of equipment to students. 

I was the team leader for this project, and bore the responsibility of coordinating the team’s progress and deliverables for each milestone. In addition, my role as a developer was to implement the minimum required quantity feature, which is documented below.

---
## Summary of contributions

### **Individual Feature: Minimum required quantity**
**What it does**: Allows users to specify a minimum required quantity of a stock. This the minimum amount of the stock that the inventory intends to have on hand at any given time. Eggventory will warn users if the stock quantity has fallen below the minimum. Users can also generate a list detailing the amount of stocks they need to purchase to meet the respective minimum quantities. 

**Justification**: Since inventories constantly need to make loans, users should receive ample warning before a stock is completely depleted. Realistically, users would prefer to have some notice beforehand, to have time to order new stocks or track down overdue loans. The feature allows the minimum value to be user-defined, depending the importance or popularity of the stock within the inventory.   

**Highlights**: This feature was challenging to implement as any mistakes in processing integer quantities would result in major bugs (eg. negative stocks). Careful consideration was given to the way this feature would require information from both the Stock and LoanList classes. 

### **Shared Feature: Loan System**
**What it does**: Allows users to record loans of the inventory's stock to other people, mainly students, and checks if there are sufficient stocks to make each loan. 

**Justification**: School inventories loan stock to students regularly, and benefit from a means of keeping track of all loans made. 

**Highlights**: This feature was developed in collaboration with team member [Benjamin](https://github.com/Deculsion). Loans were implemented as an association between Person and Stock objects. 

### **Shared Code Contributions**

**Loan Feature**: Shared feature implemented with . (Code: 
[Loan.java](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/src/main/java/eggventory/model/loans/Loan.java),
[LoanList.java](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/src/main/java/eggventory/model/LoanList.java),
[AddLoanCommand.java](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/src/main/java/eggventory/logic/commands/add/AddLoanCommand.java),
[DeleteLoanCommand.java](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/src/main/java/eggventory/logic/commands/delete/DeleteLoanCommand.java))

**Logic (Parser) Module**: Developed main Parser structure. Wrote logic for ParseAdd and ParseDelete. (Code: 
[Parser.java](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/src/main/java/eggventory/logic/parsers/Parser.java), 
[ParseAdd.java](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/src/main/java/eggventory/logic/parsers/ParseAdd.java),
[ParseDelete.java](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/src/main/java/eggventory/logic/parsers/ParseDelete.java))

**All code contributions**: [Reposense](https://nuscs2113-ay1920s1.github.io/dashboard/#search=cyanoei) _(Note: Contribution graph was affected by a rebase, but contributions are still properly attributed.)_

### **Other Contributions**

#### **Project management**
- Managed issues and PRs for each milestone (tagging and closing). 
- Tagged and wrote detailed comments for
[peer bug reports](https://github.com/AY1920S1-CS2113T-F09-3/main/issues?utf8=%E2%9C%93&q=is%3Aissue+label%3Atype.MockPE+)
after Mock PE. (eg.
[#297](https://github.com/AY1920S1-CS2113T-F09-3/main/issues/297)
[#328](https://github.com/AY1920S1-CS2113T-F09-3/main/issues/328)
[#334](https://github.com/AY1920S1-CS2113T-F09-3/main/issues/334)
)

#### **Documentation**
- Was responsible for final editing and submission of all drafts of User Guide and Developer guide. 
- Wrote User Guide sections [3.4](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/docs/CS2113T-F09-3-Eggventory-UG.md#34-managing-your-list-of-people),
[3.5](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/docs/CS2113T-F09-3-Eggventory-UG.md#35-managing-your-list-of-loans), and
[3.7](https://github.com/AY1920S1-CS2113T-F09-3/main/blob/master/docs/CS2113T-F09-3-Eggventory-UG.md#37-minimum-required-quantity) (shown below). 
- Wrote Developer Guide sections 5.3.1, 6.3, 6.5 (shown below). _(Note: Unable to link DG contributions as it is not on Github.)_


#### **Community**
- Over 60 [team PRs reviewed](https://github.com/AY1920S1-CS2113T-F09-3/main/pulls?utf8=%E2%9C%93&q=reviewed-by%3Acyanoei+), including:
[#220](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/220),
[#223](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/223),
[#251](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/251),
[#261](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/261),
[#345](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/345),
[#349](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/349),
[#366](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/366).
- Bugs fixed for team code: 
[#236](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/236),
[#240](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/240),
[#352](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/352),
[#358](https://github.com/AY1920S1-CS2113T-F09-3/main/pull/358).

- Meaningful bugs found in other teams' code: 
[[example1]](https://github.com/AY1920S1-CS2113T-F11-3/main/issues/146),
[[example2]](https://github.com/AY1920S1-CS2113T-F11-3/main/issues/147).
