package com.netshoes.problems.problem2.impl;

// Nao alterar o nome dessa classe!
public class CompareVersionImpl {

    // Nao alterar a assinatura desse metodo
    public static int compareVersion(String version1, String version2) {
    		String[] vers1 = version1.split("\\.");
    		String[] vers2 = version2.split("\\.");

    		int lengthVers1 = vers1.length;
    		int lengthVers2 = vers2.length;
    		int menorLength = lengthVers1 < lengthVers2 ? lengthVers1 : lengthVers2;

    		int nivelV1 = -1;
    		int nivelV2 = -1;
    		for (int index = 0; index < menorLength; index++) {
    			nivelV1 = Integer.valueOf(vers1[index]);
    			nivelV2 = Integer.valueOf(vers2[index]);

    			if (nivelV1 >  nivelV2) {
    				return 1;
    			} else {
    				if (nivelV1 < nivelV2) {
    					return -1;
    				}
    			}
			}

    		if (lengthVers1 != lengthVers2) {
    			if (lengthVers1 < lengthVers2) {
    				nivelV2 = Integer.valueOf(vers2[vers1.length]);
    				if (nivelV2 == 0)
    					return 0;
    				return -1;
    			} else {
    				nivelV1 = Integer.valueOf(vers1[vers2.length]);
    				if (nivelV1 == 0)
    					return 0;
    				return 1;
    			}
    		}

        return 0;
    }
}
