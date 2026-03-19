import 'package:auth_application/components/important_text.dart';
import 'package:auth_application/components/our_textfield.dart';
import 'package:flutter/material.dart';

class RegisterPage extends StatelessWidget {
  const RegisterPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color.fromARGB(255, 29, 59, 83),

      body: Center(
        child: Column(
          children: [
            Icon(
              Icons.group_work,
              size: 140,
              color: Color.fromARGB(255, 228, 100, 91),
              shadows: [
                Shadow(
                  color: Color.fromARGB(255, 232, 139, 133),
                  blurRadius: 8,
                ),
              ],
            ),

            ImportantText(contentOfTheText: "Connect app", sizeOfTheText: 36,),

            ImportantText(contentOfTheText: "The place where people connect", sizeOfTheText: 24,),

            OurTextfield(ourHintText: "Type your email...",),
            OurTextfield(ourHintText: "Choose a password...", ourShowText: true,),
            OurTextfield(ourHintText: "Confirm your password...", ourShowText: true,),

            GestureDetector(
              onTap: () {
                print("Starting register...");
              },
              child: Container(
                padding: EdgeInsets.all(10),
                color: Colors.blue,
                child: Text("Register"),
              ),
            ),
          ],
        ),
      ),
    );
  }
}