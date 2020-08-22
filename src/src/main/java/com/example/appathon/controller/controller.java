package com.example.appathon.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.*;
import database.DBConnection;
import database.ResultSetToJsonMapper;
import javax.xml.transform.Result;
import org.json.JSONArray;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @RequestMapping(value = "/")
    public String homePage(){
        return "home";
    }

    @RequestMapping(value = "/api/voice-data/{municipality}")
    @ResponseBody
    public String voiceApi(@PathVariable(value="municipality") String municipality) throws Exception {
        DBConnection conn = new DBConnection();

        Connection connect = DBConnection.getConnection();
        Statement stmt = connect.createStatement();
        String dada = municipality;
        ResultSet result = stmt.executeQuery("select sum(voice_in + voice_out) as voice_total, event_date from table1 where cell_municipality = '" + municipality +"' group by event_date order by event_date limit 30;");

        JSONArray  JArray =  ResultSetToJsonMapper.convert(result);
        String ret = JArray.toString();
        return ret;
    }

    @RequestMapping(value = "/api/bandwidth-data/{municipality}")
    @ResponseBody
    public String BandwidthApi(@PathVariable(value="municipality") String municipality) throws Exception {
        DBConnection conn = new DBConnection();

        Connection connect = DBConnection.getConnection();
        Statement stmt = connect.createStatement();
        String dada = municipality;
        ResultSet result = stmt.executeQuery("select sum(bytes_up + bytes_down) as data_total, event_date from table1  where cell_municipality = '" + municipality + "' group by event_date order by event_date limit 30;");

        JSONArray  JArray =  ResultSetToJsonMapper.convert(result);
        String ret = JArray.toString();
        return ret;
    }

}
