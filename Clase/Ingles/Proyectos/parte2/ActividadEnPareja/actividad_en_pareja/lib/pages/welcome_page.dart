import 'package:actividad_en_pareja/components/data_information.dart';
import 'package:actividad_en_pareja/components/navigator_bar.dart';
import 'package:actividad_en_pareja/components/section_separator.dart';
import 'package:flutter/material.dart';

class WelcomePage extends StatelessWidget {
  const WelcomePage({super.key});

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
                                title: "Customs of the English-speaking community",
                                children: [
                                  Text(
                                    "San Francisco is very diverse, but within the English-speaking community you'll notice:",
                                    style: TextStyle(
                                      fontSize: 20,
                                      fontWeight: FontWeight.bold,
                                    ),
                                  ),
                                  SizedBox(height: 10),

                                  Text(
                                    " - \t Coffee and brunch culture: People often socialize in cafés or meet for brunch on weekends. \n"
                                    " - \t Sustainable mobility: Walking, biking, and public transport are widely used. \n"
                                    " - \t Community events: Festivals, farmers' markets, and outdoor activities are common. \n"
                                    " - \t Respect for diversity: Inclusion across cultures, identities, and lifestyles is a core habit. \n",
                                    style: TextStyle(
                                      fontSize: 15,
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),
                                ],
                              ),
                              SectionSeparator(),
                              
                              DataInformation(
                                padding: 10,
                                title: "Social norms",
                                children: [
                                  Text(
                                    " - \t Direct but polite communication: Honesty is valued, but always with respect. \n"
                                    " - \t Semi-strict punctuality: Important for work, more relaxed socially. \n"
                                    " - \t Personal space: Physical distance is generally respected. \n"
                                    " - \t Social awareness: Topics like the environment, equality, and social justice matter a lot. \n",
                                    style: TextStyle(
                                      fontSize: 15,
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),
                                ],
                              ),
                              SectionSeparator(),

                              DataInformation(
                                padding: 10,
                                title: "Values and beliefs",
                                children: [
                                  Text(
                                    " - \t Innovation and entrepreneurship: Strong influence from the tech ecosystem. \n"
                                    " - \t Progressive mindset: Many people support liberal social values. \n"
                                    " - \t Diversity and inclusion: Central to the cities identity. \n"
                                    " - \t Work-life balance: Career is important, but so is personal well-being. \n",
                                    style: TextStyle(
                                      fontSize: 15,
                                      fontWeight: FontWeight.bold
                                    ),
                                  ),
                                ],
                              ),
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
