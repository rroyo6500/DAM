import 'package:flutter/material.dart';

class ExampleStack extends StatelessWidget {
  const ExampleStack({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Stack(
          alignment: AlignmentGeometry.center,
          fit: StackFit.expand,
          children: [

            Image.asset(
              "lib/images/background1.jpg",
              fit: BoxFit.cover,
            ),

            Container(
              width: 400,
              height: 400,
              color: Colors.amber,
            ),

            Text("No amount of knowledge or theory can substitute practice"),
            
            Container(
              width: 200,
              height: 200,
              color: Colors.blue,
            ),

          ],
        ),
      ) ,
    );
  }
}