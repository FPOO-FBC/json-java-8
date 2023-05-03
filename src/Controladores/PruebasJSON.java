/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Device;
import Modelos.Person;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.LinkedList;
/**
 *
 * @author Asus
 */
public class PruebasJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> people = new LinkedList<>();
        Person p1=new Person("John", 25);
        p1.getDevices().add(new Device("celular", 500000));
        p1.getDevices().add(new Device("tv", 1500000));
        Person p2=new Person("Jane", 30);
        p2.getDevices().add(new Device("tv", 2500000));
        people.add(p1);
        people.add(p2);
        
        guardar(people);
        //cargar();
    }

    public static void guardar(List<Person> people) {
        Gson gson = new Gson();
        String json = gson.toJson(people);

        try (Writer writer = new FileWriter("people.json")) {
            gson.toJson(people, writer);
        } catch (Exception e) {

        }
    }

    public static void cargar() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader("people.json")) {
            Type type = new TypeToken<List<Person>>() {
            }.getType();
            List<Person> people = gson.fromJson(reader, type);

            // hacer algo con la lista de objetos cargada
            for (Person actual:people) {
                System.out.println(actual.getName());
            }
        } catch (Exception e) {

        }

    }

}
