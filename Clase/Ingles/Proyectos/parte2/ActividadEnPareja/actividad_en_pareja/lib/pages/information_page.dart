import 'package:actividad_en_pareja/components/data_information.dart';
import 'package:actividad_en_pareja/components/navigator_bar.dart';
import 'package:actividad_en_pareja/components/section_separator.dart';
import 'package:flutter/material.dart';

class InformationPage extends StatelessWidget {
  const InformationPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          SizedBox.expand(
            child: Image.asset(
              "lib/images/san-francisco.jpg",
              fit: BoxFit.cover,
            ),
          ),
          SizedBox.expand(
            child: Scrollbar(
              thumbVisibility: false,
              thickness: 8.0,
              radius: Radius.circular(10),
              child: SingleChildScrollView(
                child: Column(
                  children: [
                    NavigatorBar(),

                    Padding(
                      padding: const EdgeInsets.all(50),
                      child: Container(
                        padding: EdgeInsets.all(20),
                        decoration: BoxDecoration(
                          color: Colors.white,
                          border: Border.all(color: Colors.black, width: 2),
                          borderRadius: BorderRadius.circular(50),
                        ),
                        width: MediaQuery.widthOf(context) * 0.95,

                        child: Padding(
                          padding: const EdgeInsets.all(25.0),
                          child: Column(
                            mainAxisAlignment: MainAxisAlignment.start,
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              DataInformation(
                                padding: 10,
                                title: "Software Development Jobs",
                                children: [
                                  Text(
                                    "San Francisco is one of the world’s main tech hubs. Common roles include:",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),

                                  SizedBox(height: 10),

                                  Text(
                                    "\t- Software Engineer (Frontend, Backend, Full Stack)\n"
                                    "\t- Data Scientist / Machine Learning Engineer\n"
                                    "\t- DevOps Engineer\n"
                                    "\t- Mobile App Developer (iOS/Android)\n"
                                    "\t- Product Engineer",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),

                                  SizedBox(height: 10),

                                  Text(
                                    "Major companies like Google, Meta, and Salesforce operate in the area, alongside many startups.",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),
                                ],
                              ),
                              SectionSeparator(),
                              DataInformation(
                                padding: 10,  
                                title: "Differences in the English spoken",
                                children: [
                                  
                                  Text(
                                    "English in San Francisco is mostly General American English, but with some unique touches:",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),

                                  SizedBox(height: 10),

                                  Text(
                                    "1. Tech vocabulary\n"
                                    "\t\t\t\t- “Startup” → a new company\n"
                                    "\t\t\t\t- “Pitch” → presenting an idea\n"
                                    "\t\t\t\t- “Scale” → growing a product or business\n\n"
                                    "2. Multicultural influence\n"
                                    "\t\t\t\t    Frequent use of words from other languages (especially Spanish and Chinese).\n"
                                    "\t\t\t\t    Example: “Let’s grab tacos later.\n\n"
                                    "3. Local expressions\n"
                                    "\t\t\t\t- “The City” → San Francisco\n"
                                    "\t\t\t\t- “Bay Area” → the surrounding region\n"
                                    "\t\t\t\t- “Hell yeah” → enthusiastic agreement\n\n"
                                    "4. Accent\n"
                                    "\t\t\t\t    The accent is fairly neutral, making it easier for English learners to understand.\n",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),

                                ],
                              ),
                              SectionSeparator(),

                              DataInformation(
                                padding: 10, 
                                title: "What I like about San Francisco",
                                children: [
                                  Text(
                                    "The mix of technology, nature, and culture\nIconic places like the Golden Gate Bridge\nOpen-minded and creative atmosphere\nStrong connection to global innovation",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    )
                                  )
                                ],
                              )
                            ],
                          ),
                        ),
                      ),
                    ),
                  ],
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
