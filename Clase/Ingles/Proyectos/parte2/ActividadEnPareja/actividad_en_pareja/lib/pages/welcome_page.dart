import 'package:actividad_en_pareja/components/navigator_bar.dart';
import 'package:flutter/material.dart';

class WelcomePage extends StatelessWidget {
  const WelcomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color.fromARGB(255, 232, 139, 133),

      body: Stack(
        alignment: AlignmentGeometry.center,
      
        children: [
          NavigatorBar(),
          SizedBox.expand(
            child: Image.asset(
              "lib/images/sanfrancisco.jpg",
              fit: BoxFit.cover,
            ),
          ),
        ],
      ),
    );
  }
}
