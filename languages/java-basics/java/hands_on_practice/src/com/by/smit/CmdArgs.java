/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.by.smit;

/**
 *
 * @author smit
 */
public class CmdArgs {
	public static void main(String args[]) {
		int a = args.length;

		for (int i = 0; i < a; i++) {
			System.out.println("args[" + i + "]" + args[i]);
		}
	}
}
