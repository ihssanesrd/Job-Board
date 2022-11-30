package com.login;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.google.gson.Gson;

import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.InfoGainAttributeEval;
import weka.attributeSelection.Ranker;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Utils;
import weka.core.converters.CSVLoader;

/**
 * Servlet implementation class welcome
 */
@WebServlet("/welcome")
public class welcome extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
	
	public double convert(Boolean b) {
		return b.compareTo(false);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Gson gson = new Gson();
		String[] skills = gson.fromJson(request.getParameter("skills"), String[].class);
		
		ArrayList<String> list = new ArrayList<>();
		
        list.add("html");
        list.add("python");
        list.add(" c ");
        list.add("c++");
        list.add("css");
        list.add("javascript");
        list.add("react");
        list.add("vue");
        list.add("jquery");
        list.add("angular");
        list.add("swift");
        list.add("bootstrap");
        list.add("flutter");
        list.add("type script");
        list.add("sass");
        list.add("agile");
        list.add("hadoop");
        list.add("docker");
        list.add("json");
        list.add("shell");
        list.add("kubernetes");
        list.add("linux");
        list.add("spark");
        list.add("ccna");
        list.add("ccnp");
        list.add("git");
        list.add("moa");
        list.add("sql");
        list.add("oracle");
        list.add("spring");
        list.add("php");
        list.add("aws");
        list.add("power bi");
        list.add("java");
        
        ArrayList<String> arrayToBeSent = new ArrayList<String>();
        List<String> skillsArray = Arrays.asList(skills);
        	for(String skill : list) {
        		boolean bool = false;
        			bool = skillsArray.contains(skill);
            		arrayToBeSent.add(String.valueOf(convert(bool)));
        		}
    
        	
        	double[] vals = new double[arrayToBeSent.size()];
        	
        	for(int i=0 ; i<arrayToBeSent.size() ; i++) {
        		vals[i]=Double.parseDouble(arrayToBeSent.get(i));
            	System.out.println(arrayToBeSent.get(i));
        	}
        	try {
        		CSVLoader loader = new CSVLoader();
                loader.setSource(new File("C:\\Users\\User\\Desktop\\S7\\Java\\MiniProjetScrap\\HardSkillsCSV\\RekruteAndIndeedData.csv"));
                Instances data = loader.getDataSet();
        		System.out.println(data.numInstances() + " instances loaded.");
        		 System.out.println(data.toString());
        		 AttributeSelection attSelect = new AttributeSelection();
        		 InfoGainAttributeEval eval = new InfoGainAttributeEval();
        		 Ranker search = new Ranker();
        		 attSelect.setEvaluator(eval);
        		 attSelect.setSearch(search);
        		 attSelect.SelectAttributes(data);
        		 int[] indices = attSelect.selectedAttributes();
        		 System.out.println("Selected attributes: "+Utils.arrayToString(indices));
        		 
        		 //Build a decision tree
        		 
        		String[] options = new String[1];
        		options[0] = "-U";
        		J48 tree = new J48();
        		tree.setOptions(options);
        		tree.buildClassifier(data);
        		
            	double[] var = new double[data.numAttributes()];
            	for(int i=0 ; i<vals.length ; i++) {
            		var[i] = vals[i];
            	}
            	Instance userInstance = new DenseInstance(1.0, var);
        		//Assosiate your instance with Instance object in this case dataRaw
            	userInstance.setDataset(data); 

        		double label = tree.classifyInstance(userInstance);
        		System.out.println(data.classAttribute().value((int) label));        	}
        	catch(Exception e){
        		e.printStackTrace();
        	}
        	

        	

    		
        	/*Classification weka;
        	try {
        		weka = new Classification("Classifier weka;");
        		weka.selectFeatures();
        		weka.buildDecisionTree();
        		String result = weka.classifyData(vals);
        		String desc = DB_services.get_desc(result);
        		JSONObject jo = new JSONObject();
        		jo.put("job",result);
        		jo.put("description", desc);
        		System.out.println("-----------");
        		System.out.println("jo.toString");
        		System.out.println("-----------");
        		PrintWriter out = response.getWriter();
        		response.setContentType("text");
        		out.println(jo.toString());
        	}catch(Exception e1) {
        		e1.printStackTrace();
        	}
        	*/
	}

}

