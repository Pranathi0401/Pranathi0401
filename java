Description
                    
                    

"PawHaven" a pet adoption center, manages various pets like dogs, cats, and rabbits. Each pet has a name, breed, and age in months, but manual tracking and filtering have caused inefficiencies in adoption decisions.
To streamline operations, they need a Java-based system to automatically manage and filter pet details by breed and age in months, enabling the staff to make faster adoption choices.
Functional Requirement:

    
        
            
                Req. #
            
            
                 Type (Class)
            
            
                Requirement Description  
            
            
                Method Name
            
            
                Parameters
            
            
                Responsibilities
            
        
        
            
                1
            
            
                PetInfo
            
            
                Add the pet details to the petSet.
            
            
                addPetDetails
            
            
                String petDetails
            
            
                This method should add the petDetails to the petSet, which is implemented as a TreeSet.
                
                Constraints:
                
                
                    petDetails contains petName, breed and ageInMonth separated by a colon ( : ).
                
                
                
            
        
        
            
                2
            
            
                PetInfo
            
            
                Filter the pets name by the specified age in month and breed.
            
            
                filterPetsByAgeAndBreed
            
            
                int ageInMonth, String breed
            
            
                
                
                This method filters pet names from the petSet based on age and breed. If a pet's age is less than or equal to the given ageInMonth and its breed matches the specified breed, its name is added to a new set (treeSet). The method returns a set of names for all pets that meet these conditions.
                Constraints: 
                
                
                    The breed is case - sensitive
                    The method should return the Set of Strings.
                
                
            
        
    

You are provided with the main method in the UserInterface class as code template, and it is excluded from evaluation.
Note:


    Edit only the PetInfo class to implement the business requirements.
    The methods should be public, and the attributes of the class should be private. 
    In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.
    Ensure that the names for classes, attributes, and methods are provided as specified in the question description.
    Please do not use System.exit(0); to terminate the program.


Sample Input/Output 1:


    
        Enter the number of pets to add:5Enter pet details in the format (Name:Breed:AgeInMonths):Mini:Labrador:4Daisy:Labrador:5Rocky:Poodle:7Milo:Beagle:2Daisy:Labrador:5Enter maximum age in months to filter:5Enter breed to filter:LabradorPets matching the criteria:DaisyMini
        
    
Sample Input/Output 2:

    
        Enter the number of pets to add:2Enter pet details in the format (Name:Breed:AgeInMonths):Coco:Shih Tzu:4Buddy:Labrador:6Enter maximum age in months to filter:2Enter breed to filter:Shih TzuNo Shih Tzu pets are available that are 2 months old or youngerSample Input/Output 3:
        
    
Enter the number of pets to add:2Enter pet details in the format (Name:Breed:AgeInMonths):Coco:Shih Tzu:4Buddy:Labrador:6Enter maximum age in months to filter:5Enter breed to filter:GermanShepardNo pets found for breed 'GermanShepard' under or less than or equal to 5 months.
