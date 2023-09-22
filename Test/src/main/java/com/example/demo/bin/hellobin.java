package com.example.demo.bin;
import org.springframework.stereotype.Component;
@Component ("bean")
public class hellobin {
	public String getMessage(String msg)
	{
		return "Hello" + msg;
	}
}
