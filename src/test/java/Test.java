import com.bean.Person;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author : chenhaibo
 * Version : v1.0.0
 * Time : 2016/9/24.
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
//        writeJsonObject();
//        readJsonObject();
        readJsonMap();
    }

    /**
     * 直接写入一个对象
     */
    public static void writeJsonObject() {
        ObjectMapper mapper = new ObjectMapper();
        Person person = new Person("nomouse", 25);
        try {
            mapper.writeValue(new File("e:/person.json"), person);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 直接将一个json转化为对象
     */
    public static void readJsonObject() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person person = mapper.readValue(new File("e:/person.json"), Person.class);
            System.out.println(person.getName() + ", " + person.getAge());
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 直接转化为map
     */
    public static void readJsonMap() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Map map = mapper.readValue(new File("e:/person.json"), Map.class);
            System.out.println(map.get("name") + ", " + map.get("age"));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
