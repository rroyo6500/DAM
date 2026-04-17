import 'package:actividad_en_pareja/components/data_information.dart';
import 'package:actividad_en_pareja/components/navigator_bar.dart';
import 'package:actividad_en_pareja/components/section_separator.dart';
import 'package:flutter/material.dart';

class InformationPage extends StatelessWidget {
  const InformationPage({super.key});

  final pageWidth = 1000.0;

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
                        height: pageWidth,

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
                                    "\t- “Startup” → a new company\n",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),

                                  SizedBox(height: 10),

                                  Text(
                                    "",
                                    style: TextStyle(
                                      fontWeight: FontWeight.bold
                                    ),
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
