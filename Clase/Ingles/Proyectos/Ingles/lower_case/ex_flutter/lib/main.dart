import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Color.fromARGB(255, 225, 225, 225),
        body: Center(
          child: Container(
            width: 300,
            height: 300,
            decoration: BoxDecoration(
              color: Color.fromARGB(255, 225, 225, 225),
              //border: Border.all(color: Colors.black),
              borderRadius: BorderRadius.circular(20),
              boxShadow: [
                BoxShadow(
                  color: Colors.grey.shade500,
                  blurRadius: 20,
                  offset: Offset(6, 6),
                ),
                BoxShadow(
                  color: Colors.white,
                  blurRadius: 20,
                  offset: Offset(-6, -6),
                )
              ]
            ),
          ),
        ),
      ),
    );
  }
}
