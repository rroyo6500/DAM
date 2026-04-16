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
            child: Scrollbar(
              thumbVisibility: false,
              thickness: 8.0,
              radius: Radius.circular(10),
              child: SingleChildScrollView(
                child: Column(
                  children: [
                    NavigatorBar(),
                    
                  ],
                ),
              ),
            ),
          )
        ],
      ),
    );
  }
}
