package com.example.demo.dto;

import org.springframework.stereotype.Component;



@Component
public class BoatUpdateRequest {
	
	private double price_prediction = 100d;
	
	public double getPrice_prediction() {

		return price_prediction;
	}
	public void setPrediction(Boat boat) {
float a = 0.0f,b = 0.0f,c = 0.0f,d = 0.0f,e = 0.0f,f = 0.0f,g = 0.0f,fa = 0.0f,fb = 0.0f,fc = 0.0f,fd = 0.0f,fe = 0.0f,ff=0.0f;
		
		if (boat.getbType() == 0.0f){a=1.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 1.0f){a=0.0f; b= 1.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 2.0f){a=0.0f; b= 0.0f; c=1.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 3.0f){a=0.0f; b= 0.0f; c=0.0f; d=1.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 4.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=1.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 5.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=1.0f; g=0.0f;}
		if (boat.getbType() == 6.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=1.0f;}
		if (boat.getfType() == 0.0f){fa=1.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 1.0f){fa=0.0f; fb=1.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 2.0f){fa=0.0f; fb=0.0f; fc=1.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 3.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=1.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 4.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=1.0f; ff=0.0f;}
		if (boat.getfType() == 5.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=1.0f;}
		float [] input = {boat.getYearBuilt(),boat.getLength(),boat.getWidth(),a,b,c,d,e,f,g,fa,fb,fc,fd,fe,ff};
		
		double calc =((((((((((((((((-59.41473695747893f) + ((input[0]) * (0.03388162295782835f))) + ((input[1]) * (0.18937054159865566f))) + ((input[2]) * (0.2652399064351538f))) + ((input[3]) * (0.02695870137383033f))) + ((input[4]) * (0.02247125462862746f))) + ((input[5]) * (0.07440626140876394f))) + ((input[6]) * (0.20201740237369228f))) + ((input[7]) * (-0.008975037270257995f))) + ((input[8]) * (0.035744149584928823f))) + ((input[9]) * (-0.35262273209958483f))) + ((input[10]) * (-0.24273505793530623f))) + ((input[11]) * (-0.1519973266786563f))) + ((input[12]) * (0.3578182572109012f))) + ((input[13]) * (-0.046416251892144905f))) + ((input[14]) * (-0.060179928171620725f))) + ((input[15]) * (0.14351030746682686f));
		calc = Math.exp(calc);
		this.price_prediction = calc;
	}
	
}

