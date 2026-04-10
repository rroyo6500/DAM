import 'package:actividad_en_pareja/components/navigator_bar.dart';
import 'package:flutter/material.dart';

class WelcomePage extends StatelessWidget {
  const WelcomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          SizedBox.expand(child: Image.asset(
            "lib/images/san-francisco.jpg", 
            fit: BoxFit.cover
          )),
          SizedBox.expand(
            child: Column(
              children: [
                NavigatorBar(),
                
              ],
            ),
          )
        ],
      ),
    );
  }
}
