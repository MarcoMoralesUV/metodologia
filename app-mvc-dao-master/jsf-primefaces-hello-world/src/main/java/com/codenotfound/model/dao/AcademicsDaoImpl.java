package com.codenotfound.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.codenotfound.model.Academics;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("repositoryB")
public class AcademicsDaoImpl implements AcademicsDao{
    
    @Override
    public List findAll(){
        List<Academics> list = new ArrayList<Academics>();
        Academics academics = null;
        String data = this.readFile();
        for (String nombreAcademico : data.split(";")){
            academics = new Academics();
            academics.setNombre(nombreAcademico.trim());
            list.add(academics);
        }
        return list;
        
    }
    
    private String readFile(){
        String data = "";
        try{
            FileInputStream fis = new FileInputStream("data/academics.txt");
            data = IOUtils.toString(fis, "UTF-8");
            System.out.print(data);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
}