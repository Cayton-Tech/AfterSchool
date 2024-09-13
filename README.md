# AfterSchool

## Project Description

AfterSchool is a simple web application designed to make it easy for high school students to find and download past matriculation (matric) question papers and memos for various subjects in South Africa. It offers a user-friendly search interface that allows students to quickly locate resources they need for exam preparation and review.

## Key Features

- **Fast and Efficient Search:** Utilizes client-side fuzzy searching powered by the Fuse.js library, allowing for quick and relevant results even with typos or partial search terms.
- **Offline Functionality:** The application works completely offline after the initial loading, providing access to past papers even without an internet connection. 
- **Organized by Subject:** The past papers(sourced from an old CD drive from over five years ago) are organized by subject and year, making it easy for students to find the specific resources they're looking for.
- **Simple User Interface:** A clean and straightforward interface focuses on providing a seamless search and download experience.

## Getting Started

1. **Visit the AfterSchool website:** https://cayton-tech.github.io/AfterSchool/
2. **Start Searching:** Use the search bar to find question papers or memos by subject, year, or any relevant keywords.
3. **Download:** Click on a search result to download the corresponding PDF file to your device.

## Implementation Details

- **Client-Side Technology:**  The application is built using HTML, CSS, and JavaScript and runs entirely in the user's web browser. 
- **Fuse.js for Fuzzy Search:** The Fuse.js library enables fast and accurate fuzzy searching of the past paper database.
- **File System Access API:** A separate web page (`generator.html`) uses the File System Access API to generate a static index (`files.js`) of all PDF files in a specified directory. This index is used by the main AfterSchool page for searching.
- **GitHub Pages Hosting:** The application is hosted on GitHub Pages for free and easy deployment.

## Future Enhancements

- **Improved UI/UX:**  Enhance the user interface to be more visually appealing and user-friendly, especially for mobile devices.
- **Filtering Options:**  Add filters or dropdown menus to allow users to refine their searches by subject, year, paper type (question paper or memo), and other relevant criteria.
- **Subject-Specific Trimming:** If the application's performance is affected by the large file size (2GB), consider trimming the database to include only the most common or requested subjects initially, with options to add more subjects later.
- **Additional Features:** Explore options for adding features such as user accounts, bookmarking, or integration with other educational platforms.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
