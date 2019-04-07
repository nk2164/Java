package com.nk2164.basics;

public class AutoPolicyTest {

	public static void main(String[] args) {
		AutoPolicy policy1 = new AutoPolicy(11111111,"Toyota Camry","NJ");
		AutoPolicy policy2 = new AutoPolicy(22222222,"Ford Fusion","ME");
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}

	public static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("The auto policy");
		System.out.printf("Account # : %d;Car Name: %s;%nState %s %s no-fault-state %n", 
				          policy.getAccountNumber(),
				          policy.getMakeAndModel(),
				          policy.getState(),
				          (policy.isNoFaultState()?"is a":"is not a ")); 
		
	}
}
