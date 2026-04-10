import 'package:actividad_en_pareja/components/navigator_bar.dart';
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
            child: Column(
              children: [
                NavigatorBar(),

                SizedBox(height: 50),
                Container(
                  padding: EdgeInsets.all(20),
                  decoration: BoxDecoration(
                    color: Colors.white,
                    border: Border.all(color: Colors.black, width: 2),
                    borderRadius: BorderRadius.circular(50),
                  ),
                  width: MediaQuery.widthOf(context) * 0.8,
                  height: 400,
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
