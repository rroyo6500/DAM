import 'package:auth_application/colors_app.dart';
import 'package:flutter/material.dart';

class OurTextfield extends StatelessWidget {

  final String ourHintText;
  final bool ourShowText;

  const OurTextfield({super.key, required this.ourHintText, this.ourShowText = false});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 10, horizontal: 20),
      child: TextField(

        obscureText: ourShowText,
        obscuringCharacter: "*",

        cursorColor: const Color.fromARGB(255, 228, 100, 91),
        cursorWidth: 3,

        style: TextStyle(
          color: const Color.fromARGB(255, 228, 100, 91),
          fontWeight: FontWeight.bold,
        ),

        decoration: InputDecoration(

          hintText: ourHintText,
          hintStyle: TextStyle(
            color: const Color.fromARGB(165, 228, 100, 91),
            fontStyle: FontStyle.italic,
          ),

          filled: true,
          fillColor: const Color.fromARGB(255, 16, 37, 54),

          enabledBorder: OutlineInputBorder(
            borderRadius: BorderRadius.circular(50),
            borderSide: BorderSide(
              color: ColorsApp.secondaryColorResaltant,
              width: 2,
            ),
          ),

          focusedBorder: OutlineInputBorder(
            borderRadius: BorderRadius.circular(50),
            borderSide: BorderSide(
              color: ColorsApp.primaryColorSuau,
              width: 3,
            ),
          ),
        ),
      ),
    );
  }
}