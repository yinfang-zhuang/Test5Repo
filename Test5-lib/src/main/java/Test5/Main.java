package Test5;
import com.google.gson.*;
import com.google.gson.reflect.*;

public class Main {
	public static void main(String[] args)
	{
		final Gson gson = new Gson();
		
		// original object instantiation
		ModelObject modelObject = new ModelObject("myname", 12, true, 2.3);
		System.out.println("toJson ---");
		System.out.println("Original Java object : " + modelObject);
		// converting an object to json object
		String json = gson.toJson(modelObject);
		System.out.println("Converted JSON string is : " + json);
		 
		System.out.println("fromJson----");
		// getting object from json representation
		System.out.println("Original JSON string is : " + json);
		// converting json to object
		ModelObject modelObject1 = gson.fromJson(json, ModelObject.class);
		System.out.println("Converted Java object : " + modelObject1);
	}
}
