package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class SkillsController {
    @GetMapping
    @ResponseBody
    public String greeting(){
        return "<html>"+
                "<h1> Skills Tracker"+
                "<h2> We have a few skills we would like to learn. Here is the list!"+
                "<ol>"+
                "<li> Java"+
                "<li> JavaScript"+
                "<li>Python"+
                "</li>"+
                "</li>"+
                "</li>"+
                "</ol>"+
                "</h2>"+
                "</h1>"+
                "</html>";
    }
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder, String firstlanguage,String secondlanguage,String thirdlanguage) {
        return "<html>"+
                "<h1>"+coder+
                "<ol>"+
                "<li>"+firstlanguage+
                "<li>"+secondlanguage+
                "<li>"+thirdlanguage+
                "</li>"+
                "</li>"+
                "</li>"+
                "</ol>"+
                "</h1>"+
                "</html>";

    }

    @GetMapping("form")
    @ResponseBody
    public String skillForm(){
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = '/hello'>" +
                "<h3> Name:"+
                "<br>"+
                "<input type = 'text' name = 'coder' />" +
                "<br>"+
                "<label for='first language'>My favorite language:</label>"+
                "<br>"+
                "<select id='firstlanguage' name='firstlanguage'>\n" +
                "    <option value='Java'>Java</option>\n" +
                "    <option value='JavaScript'>JavaScript</option>\n" +
                "    <option value='Python'>Python</option>\n" +
                "</select>"+
                "<br>"+
                "<label for='language'>My second favorite language:</label>"+
                "<br>"+
                "<select id='secondlanguage' name='secondlanguage'>\n" +
                "    <option value='Java'>Java</option>\n" +
                "    <option value='JavaScript'>JavaScript</option>\n" +
                "    <option value='Python'>Python</option>\n" +
                "</select>"+
                "<br>"+
                "<label for='language'>My third favorite language:</label>"+
                "<br>"+
                "<select id='third language' name='third language'>\n" +
                "    <option value='Java'>Java</option>\n" +
                "    <option value='JavaScript'>JavaScript</option>\n" +
                "    <option value='Python'>Python</option>\n" +
                "</select>"+
                "<br>"+
                "<input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
