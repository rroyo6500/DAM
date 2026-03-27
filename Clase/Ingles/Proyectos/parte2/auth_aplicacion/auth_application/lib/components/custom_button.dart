import 'package:flutter/material.dart';

class CustomButton extends StatelessWidget {

  final double width;
  final double height;

  const CustomButton({super.key, required this.width, required this.height});

  @override
  Widget build(BuildContext context) {
    return Stack(
      alignment: AlignmentGeometry.center,
      children: [
        Image.asset(
          width: width,
          height: height,
          "lib/images/boto.png"
        ),
        Text(
          "Register",
          style: TextStyle(
            color: Colors.white,
            fontSize: 18,
            fontWeight: FontWeight.bold,
          ),
        ),
      ],
    );
  }
}