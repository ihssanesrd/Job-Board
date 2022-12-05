# Job-Board

## Problematic :
Rekrute is one of the largest Moroccan job websites offering a wide variety of jobs in diffferent sectors.
A job or internship hunter challenge is to find a compatible offer with skills which match job’s requirements.
![image](https://user-images.githubusercontent.com/78508211/205676671-bf2c9d5a-3b49-419c-b534-2d884628c0ea.png)

## Our Application Goal :
-Limiting the jobs offers to IT sector by scrapping only what is needed 
-Creating an easy access application which sorts the jobs
-Exploring the most required skills for IT and creating a predicting model
Strategy :
1.Scrapping data and storing in the database
![image](https://user-images.githubusercontent.com/78508211/205676724-12a602fd-1df3-4466-ad00-c8d27bfeb851.png)
![image](https://user-images.githubusercontent.com/78508211/205676761-00bea835-396b-40d0-a8f3-1397b2e92482.png)


2.Web application building
We used HTML , CSS, JavaScript and Bootstrap to build the responsive pages of our application

![image](https://user-images.githubusercontent.com/78508211/205677366-8cb33a51-8aa2-45e0-a32f-43013d5a4474.png)
![image](https://user-images.githubusercontent.com/78508211/205677176-6736c711-a844-4bfc-b129-9909f66f58da.png)
![image](https://user-images.githubusercontent.com/78508211/205672299-c996029a-9b11-4bfa-b184-cf612c35764a.png)
![image](https://user-images.githubusercontent.com/78508211/205672369-67522755-8eb4-460e-9539-097b622dc9d1.png)
![image](https://user-images.githubusercontent.com/78508211/205672471-dc4629f2-3225-4a82-94ad-db400ea68528.png)
![image](https://user-images.githubusercontent.com/78508211/205672596-0a1bfc09-4338-43d7-ad37-3354f19cdd3b.png)

Then we built the Backend based on a MVC architecture of JEE.
![image](https://user-images.githubusercontent.com/78508211/205678352-3f911f33-d058-4d8f-8f27-4b7dae960a5e.png)

3.Machine learning approach
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





