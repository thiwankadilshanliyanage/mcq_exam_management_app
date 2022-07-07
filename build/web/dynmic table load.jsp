<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>How to add & remove table rows</title>
    <link
      href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;400&display=swap"
      rel="stylesheet"
    />

    <style>
      body {
        font-family: "Roboto", sans-serif;
      }
      h1 {
        text-align: center;
      }
      table,
      form {
        width: 500px;
        margin: 20px auto;
      }
      table {
        border-collapse: collapse;
        text-align: center;
      }
      table td,
      table th {
        border: solid 1px black;
      }
      label,
      input {
        display: block;
        margin: 10px 0;
        font-size: 20px;
      }
      button {
        display: block;
      }
    </style>
  </head>
  <body>
    <h1>Dynamically Add & Remove Table Rows</h1>
    <form>
      <div class="input-row">
        <label for="url">Url</label>
        <input type="url" name="url" id="url" />
      </div>
      <div class="input-row">
        <label for="website">Website Name</label>
        <input type="text" name="website" id="website" />
      </div>
      <button>Submit</button>
    </form>
    <table>
      <thead>
        <tr>
          <th>Url</th>
          <th>Website</th>
          <th></th>
        </tr>
      </thead>
      <tbody></tbody>
    </table>
    <script>
      const formEl = document.querySelector("form");
      const tbodyEl = document.querySelector("tbody");
      const tableEl = document.querySelector("table");
      function onAddWebsite(e) {
        e.preventDefault();
        const website = document.getElementById("website").value;
        const url = document.getElementById("url").value;
        tbodyEl.innerHTML += `
            <tr>
                <td>${url}</td>
                <td>${website}</td>
                <td><button class="deleteBtn">Delete</button></td>
            </tr>
        `;
      }

      function onDeleteRow(e) {
        if (!e.target.classList.contains("deleteBtn")) {
          return;
        }

        const btn = e.target;
        btn.closest("tr").remove();
      }

      formEl.addEventListener("submit", onAddWebsite);
      tableEl.addEventListener("click", onDeleteRow);
    </script>
  </body>
</html>