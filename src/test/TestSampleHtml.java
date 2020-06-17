package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomSampleHtml;

public class TestSampleHtml  extends BaseTest{

	
	@Test
	public void run() throws IOException, InterruptedException
		{System.out.println("i m  run");
		PomSampleHtml pm=new PomSampleHtml(d);
		System.out.println("i m  start in seconds....");
		pm.start();
		}
}
