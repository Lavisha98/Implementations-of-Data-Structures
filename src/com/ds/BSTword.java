/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds;

/**
 *
 * @author DELL-PC
 */
public class BSTword {
    static class node{
        private node left, right;
        private int value;
        private String key;
        
        public node(String str){
            left = right = null;
            value = 1;
            key = str;            
        }
    }    
    node root;
    int max = 0;
    node maxf;
    
    public void insert(String key){
        root = insertrec(root, key);
    }
    
    public node insertrec(node nn, String key){
        if(nn == null){
            nn = new node(key);
            return nn;
        }
        if(nn.key.compareTo(key) > 0)
            nn.left = insertrec(nn.left, key);
        else if(nn.key.compareTo(key) < 0)
            nn. right = insertrec(nn.right, key);
        else if(nn.key.compareTo(key) == 0){
            nn.value += 1;
            return nn;
        }
        return nn;
    }
    
    public node inorderrec(node nn){
        if(nn == null)
            return null;
        inorderrec(nn.left);
        if(nn.value > max){
            max = nn.value;
            maxf = nn;
        }
        inorderrec(nn.right);
        return maxf;
    }
    
    public int inorder(){
        node nn = inorderrec(root);
        System.out.println(nn.key + " " + nn.value);
        return inorderrec(root).value;
    }
}
