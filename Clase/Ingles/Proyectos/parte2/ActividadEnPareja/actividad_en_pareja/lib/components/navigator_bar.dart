import 'package:actividad_en_pareja/pages/information_page.dart';
import 'package:actividad_en_pareja/pages/welcome_page.dart';
import 'package:flutter/material.dart';

class NavigatorBar extends StatelessWidget {
  const NavigatorBar({super.key});

  static const double size = 100;

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      height: size,
      color: Colors.blueAccent,
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Padding(
            padding: const EdgeInsets.all((25.0)),
            child: Text(
              "San Francisco",
              style: TextStyle(
                color: Colors.white,
                fontSize: 30,
                fontWeight: FontWeight.bold,
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(25.0),
            child: Row(
              children: [
                GestureDetector(
                  onTap: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context) {
                          return WelcomePage();
                        },
                      ),
                    );
                  },

                  child: Text(
                    'Welcome Page',
                    style: TextStyle(
                      color: Colors.white,
                      fontSize: 15,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
                SizedBox(width: 20),
                GestureDetector(
                  onTap: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context) {
                          return InformationPage();
                        },
                      ),
                    );
                  },

                  child: Text(
                    'Information',
                    style: TextStyle(
                      color: Colors.white,
                      fontSize: 15,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
