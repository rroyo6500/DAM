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
            child: Icon(Icons.ac_unit_outlined, color: Colors.white),
          ),
          Padding(
            padding: const EdgeInsets.all(25.0),
            child: Row(
              children: [
                GestureDetector(
                  onTap: () {
                    Navigator.push(
                      context, 
                      MaterialPageRoute(builder: (context) {
                        return WelcomePage();
                      })
                    );
                  },
                  
                  child: Text('Profile', style: TextStyle(color: Colors.white)),
                ),
                SizedBox(width: 20),
                GestureDetector(
                  child: Text('Settings', style: TextStyle(color: Colors.white)),
                ),
              ],
            ),
          ),
        ],
      )
    );
  }
}