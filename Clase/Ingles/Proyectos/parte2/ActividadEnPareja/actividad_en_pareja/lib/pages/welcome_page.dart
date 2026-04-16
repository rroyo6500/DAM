import 'package:actividad_en_pareja/components/navigator_bar.dart';
import 'package:flutter/material.dart';

class WelcomePage extends StatelessWidget {
  const WelcomePage({super.key});

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

                    SizedBox(height: 50),

                    Container(
                      padding: EdgeInsets.all(20),
                      decoration: BoxDecoration(
                        color: Colors.white,
                        border: Border.all(color: Colors.black, width: 2),
                        borderRadius: BorderRadius.circular(50),
                      ),
                      width: MediaQuery.widthOf(context) * 0.95,
                      height: pageWidth,
                    ),

                    SizedBox(height: 50),
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
