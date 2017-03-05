package com.cosmic.cubes.test.functional;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {
  @Test
  public void BcreateUser() {
	  System.out.println("Running create user");
	
	 
  }
  @Test(dependsOnMethods="BcreateUser",priority=0)
  public void ModifyUser()
  {
	  System.out.println("Running modify user");
  }
  @Test(dependsOnMethods="BcreateUser",priority=1)
	  public void AdeleteUser()
	  {
		  System.out.println("RUnning delete User");
	  }
}
