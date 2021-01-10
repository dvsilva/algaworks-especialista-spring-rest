# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 11-05-antes-de-estudar-sobre-data-hora-relembrando-aulas-de-geografia-e-entendendo-fuso-horarios
git add .
git commit -m "Antes de estudar sobre data/hora: relembrando as aulas de geografia e entendendo os fusos horários"
git push origin 11-05-antes-de-estudar-sobre-data-hora-relembrando-aulas-de-geografia-e-entendendo-fuso-horarios

git checkout master
git merge --no-ff 11-05-antes-de-estudar-sobre-data-hora-relembrando-aulas-de-geografia-e-entendendo-fuso-horarios
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```