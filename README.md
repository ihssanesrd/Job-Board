# Job-Board

## Problematic :
Rekrute is one of the largest Moroccan job websites offering a wide variety of jobs in diffferent sectors.
A job or internship hunter challenge is to find a compatible offer with skills which match job’s requirements.
![image](https://user-images.githubusercontent.com/78508211/205671172-ea684888-2b2a-4f32-947b-a0175c9c7ff5.png)

## Our Application Goal :
-Limiting the jobs offers to IT sector by scrapping only what is needed 
-Creating an easy access application which sorts the jobs
-Exploring the most required skills for IT and creating a predicting model
Strategy :
1-Scrapping data and storing in the database
![image](https://user-images.githubusercontent.com/78508211/205671432-40b34884-8469-443e-89e8-4555ede55530.png)
![image](https://user-images.githubusercontent.com/78508211/205671598-2f89ff47-058d-4e60-9a80-ef21cb28a35e.png)

2-Web application building
We used HTML , CSS, JavaScript and Bootstrap to build the responsive pages of our application

![image](https://user-images.githubusercontent.com/78508211/205671764-a1c823ec-2669-46ef-89bd-750e6dcccb5d.png)
![image](https://user-images.githubusercontent.com/78508211/205671981-aa13537c-e049-4172-a1c7-eba63f1f995a.png)
![image](https://user-images.githubusercontent.com/78508211/205672299-c996029a-9b11-4bfa-b184-cf612c35764a.png)
![image](https://user-images.githubusercontent.com/78508211/205672369-67522755-8eb4-460e-9539-097b622dc9d1.png)
![image](https://user-images.githubusercontent.com/78508211/205672471-dc4629f2-3225-4a82-94ad-db400ea68528.png)
![image](https://user-images.githubusercontent.com/78508211/205672596-0a1bfc09-4338-43d7-ad37-3354f19cdd3b.png)

Then we built the Backend based on a MVC architecture of JEE.
![image](https://user-images.githubusercontent.com/78508211/205672689-ad315f8e-b338-4d03-9379-00a1edb4ac0b.png)

3-Machine learning approach
![image](https://user-images.githubusercontent.com/78508211/205673219-42cd1750-80a3-48be-a3b8-1b794d043a81.png)

We did bivariate analysis to see which varible affects which variable like if there is an association between the type of contract and the fuction we would want to train our model to predict the type of contract based on the function and so on.
![image](https://user-images.githubusercontent.com/78508211/205673471-9ab3008e-cdc9-44d9-97fd-632ff3f86d19.png)

Once our associations done, we moved to search the most accurate model for our problem
![image](https://user-images.githubusercontent.com/78508211/205673594-29f04fc6-52ef-469c-8f00-67efcd6a778d.png)
![image](https://user-images.githubusercontent.com/78508211/205673678-173f054a-98a4-49eb-bcea-0f3d47c41a79.png)
![image](https://user-images.githubusercontent.com/78508211/205673745-4f48ce7f-43ce-43eb-896e-0d865a0ef2fa.png)



How to run the application :
Move to the project directory then run the tomcat server
```
mvn tomcat7:run
```

And then you can get access to all application features which are listing all the jobs scrapped from Rekrute and Indeed and filter them as u desire.
You can also have a prediction of your future job or function based on the skills you master.
![image](https://user-images.githubusercontent.com/78508211/205675134-83280a73-b13b-4f11-a637-135a64d7527f.png)
![image](https://user-images.githubusercontent.com/78508211/205675925-498f487a-4975-4124-9974-5247c6add3b0.png)





