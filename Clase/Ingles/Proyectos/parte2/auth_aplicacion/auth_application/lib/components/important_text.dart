import 'package:flutter/material.dart';

class ImportantText extends StatelessWidget {

final String contentOfTheText;
final double sizeOfTheText;

  const ImportantText({super.key, required this.contentOfTheText, required this.sizeOfTheText});

  @override
  Widget build(BuildContext context) {
    return Text(
      contentOfTheText,
      style: TextStyle(
        color: Color.fromARGB(255, 228, 100, 91),
        fontSize: sizeOfTheText,
        shadows: [
          Shadow(
            color: Color.fromARGB(255, 232, 139, 133), 
            blurRadius: 8
          ),
        ],
      ),
    );
  }
}