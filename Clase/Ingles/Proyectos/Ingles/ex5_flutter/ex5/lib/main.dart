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
        body: Center(
          child: Container(
            width: 600,
            height: 400,
            decoration: BoxDecoration(
              color: Colors.redAccent,
              borderRadius: BorderRadius.circular(10),
              border: Border.all(
                color: Colors.red,
                width: 4,
              ),
              boxShadow: [
                BoxShadow(
                  color: Colors.red,
                  blurRadius: 20,
                ),
              ],
            ),
            child: Image.asset("lib/assets/images/image1.jpg")
          ),
        ),
        backgroundColor: Colors.black,
      ),
    );
  }
}
